package com.mahesaiqbal.mysimplecleanarchitecture.data

import com.mahesaiqbal.mysimplecleanarchitecture.domain.IMessageRepository
import com.mahesaiqbal.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}