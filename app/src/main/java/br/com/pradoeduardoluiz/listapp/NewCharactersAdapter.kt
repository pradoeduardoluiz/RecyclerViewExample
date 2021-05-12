package br.com.pradoeduardoluiz.listapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load

class NewCharactersAdapter(val onItemClick: (Character) -> Unit) :
  ListAdapter<Character, NewCharactersAdapter.ViewHolder>(DIFF_CALLBACK) {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val view = LayoutInflater.from(parent.context)
      .inflate(R.layout.characters_item, parent, false)
    return ViewHolder(view)
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(getItem(position))
  }

  inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var image: ImageView = itemView.findViewById(R.id.image)
    var name: TextView = itemView.findViewById(R.id.name)
    var species: TextView = itemView.findViewById(R.id.specie)

    fun bind(character: Character) {
      itemView.setOnClickListener { onItemClick(character) }
      image.load(character.image)
      name.text = character.name
      species.text = character.species
    }
  }

  private companion object {
    val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Character>() {
      override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean {
        return oldItem.id == newItem.id
      }

      override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean {
        return oldItem == newItem
      }
    }
  }

}
