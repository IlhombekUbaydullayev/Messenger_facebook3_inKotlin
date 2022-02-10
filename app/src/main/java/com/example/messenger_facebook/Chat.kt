package com.example.messenger_facebook

import com.example.messenger_facebook.model.Message
import com.example.messenger_facebook.model.Room
import java.text.ParsePosition


class Chat {
    var message: Message? = null
    var rooms: ArrayList<Room> = ArrayList()
    var position : Int = 0

    constructor(position: Int) {
        this.position = position
    }

    constructor(message: Message) {
        this.message = message
    }

    constructor(rooms:ArrayList<Room>) {
        this.rooms = rooms
    }
}