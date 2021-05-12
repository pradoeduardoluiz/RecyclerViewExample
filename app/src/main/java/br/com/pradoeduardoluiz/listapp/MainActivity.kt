package br.com.pradoeduardoluiz.listapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

  private lateinit var recyclerView: RecyclerView

  //  private lateinit var adapter: CharactersAdapter
  private lateinit var adapter: NewCharactersAdapter

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    recyclerView = findViewById(R.id.characters)
    adapter = NewCharactersAdapter(onItemClick = { character ->
      Toast.makeText(this, character.name, Toast.LENGTH_SHORT).show()
    })

    setupRecyclerView()
    buildCharacters()
  }

  private fun setupRecyclerView() {
    recyclerView.adapter = adapter
    recyclerView.layoutManager = LinearLayoutManager(this)
  }

  private fun buildCharacters() {
    val characters = listOf(
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
      Character(
        id = 1,
        name = "Rick Sanchez",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/1.jpeg"
      ),
      Character(
        id = 2,
        name = "Morty Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/2.jpeg"
      ),
      Character(
        id = 3,
        name = "Summer Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/3.jpeg"
      ),
      Character(
        id = 4,
        name = "Beth Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/4.jpeg"
      ),
      Character(
        id = 4,
        name = "Jerry Smith",
        species = "Human",
        image = "https://rickandmortyapi.com/api/character/avatar/5.jpeg"
      ),
      Character(
        id = 5,
        name = "Abadango Cluster Princess",
        species = "Alien",
        image = "https://rickandmortyapi.com/api/character/avatar/6.jpeg"
      ),
    )
    adapter.submitList(characters)
  }

}
