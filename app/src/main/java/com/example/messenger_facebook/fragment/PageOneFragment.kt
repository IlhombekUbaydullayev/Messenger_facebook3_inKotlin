package com.example.messenger_facebook.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messenger_facebook.Chat
import com.example.messenger_facebook.R
import com.example.messenger_facebook.adapter.ChatAdapter
import com.example.messenger_facebook.model.Message
import com.example.messenger_facebook.model.Room

class PageOneFragment : Fragment() {

    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(R.layout.fragment_first, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(context,1))

        refreshAdapters(getAllChats())
    }

    private fun refreshAdapters(chats:ArrayList<Chat>) {
        val adapter = context?.let { ChatAdapter(it, chats) }
        recyclerView.adapter = adapter
    }

    private fun getAllChats(): ArrayList<Chat> {
        val stories: ArrayList<Room> = ArrayList<Room>()
        stories.add(Room(R.drawable.img19,"",0))
        stories.add(Room(R.drawable.img20,"Laziz Ubaydullayev",1))
        stories.add(Room(R.drawable.img21,"Amir Ubaydullayev",1))
        stories.add(Room(R.drawable.img22,"Said Ubaydullayev",1))
        stories.add(Room(R.drawable.img23,"Jamshid Ubaydullayev",1))
        stories.add(Room(R.drawable.img24,"Begzod Ubaydullayev",1))
        stories.add(Room(R.drawable.img25,"Abdulhay Ubaydullayev",1))
        stories.add(Room(R.drawable.img21,"Abdulhay Ubaydullayev",1))
        stories.add(Room(R.drawable.img22,"Abdulhay Ubaydullayev",1))
        stories.add(Room(R.drawable.img23,"Abdulhay Ubaydullayev",1))
        stories.add(Room(R.drawable.img24,"Abdulhay Ubaydullayev",1))

        val chats: ArrayList<Chat> = ArrayList()

        chats.add(Chat(stories))

        chats.add(Chat(Message(R.drawable.img19,"Ilhombek",false,0)))
        chats.add(Chat(Message(R.drawable.img20,"Maqsit",true,0)))
        chats.add(Chat(Message(R.drawable.img21,"Jamol",false,0)))
        chats.add(Chat(Message(R.drawable.img22,"Karim",true,0)))
        chats.add(Chat(Message(R.drawable.img23,"Leyla",false,0)))
        chats.add(Chat(Message(R.drawable.img24,"Amanda",true,0)))
        chats.add(Chat(Message(R.drawable.img25,"Alex",false,0)))
        chats.add(Chat(Message(R.drawable.img26,"Bahodir",true,0)))
        chats.add(Chat(Message(R.drawable.img21,"Olim",false,0)))
        chats.add(Chat(Message(R.drawable.img22,"Zayniddin",true,0)))
        chats.add(Chat(Message(R.drawable.img24,"Javohir",false,0)))
        chats.add(Chat(Message(R.drawable.img26,"Umit",true,0)))
        chats.add(Chat(Message(R.drawable.img22,"Zaynab",false,0)))
        chats.add(Chat(Message(R.drawable.img20,"Sherali",false,0)))

        return chats
    }
}