package br.com.pradoeduardoluiz.listapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharactersAdapter : RecyclerView.Adapter<CharactersAdapter.ViewHolder>() {

  private var characters: MutableList<Character> = mutableListOf()

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view = LayoutInflater.from(parent.context)
      .inflate(R.layout.characters_item, parent, false)
    return ViewHolder(view)
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val character = characters[position]
    holder.bind(character)
  }

  override fun getItemCount(): Int = characters.size

  fun setData(characters: List<Character>) {
    this.characters = characters.toMutableList()
    notifyDataSetChanged()
  }

  fun deleteData(character: Character) {
    characters.forEachIndexed { index, obj ->
      if (obj.id == character.id) {
        notifyItemRemoved(index)
      }
    }
  }

  class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var image: ImageView = itemView.findViewById(R.id.image)
    var name: TextView = itemView.findViewById(R.id.name)
    var species: TextView = itemView.findViewById(R.id.specie)

    fun bind(character: Character) {
      name.text = character.name
      species.text = character.species
    }
  }

}
