package com.mahesaiqbal.mysimplecleanarchitecture.data

import com.mahesaiqbal.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name, Welcome to the Clean Architecture")
    }
}