package com.mahesaiqbal.mysimplecleanarchitecture.data

import com.mahesaiqbal.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}