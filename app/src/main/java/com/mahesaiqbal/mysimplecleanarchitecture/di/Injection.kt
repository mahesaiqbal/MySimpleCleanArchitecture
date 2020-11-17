package com.mahesaiqbal.mysimplecleanarchitecture.di

import com.mahesaiqbal.mysimplecleanarchitecture.data.IMessageDataSource
import com.mahesaiqbal.mysimplecleanarchitecture.data.MessageDataSource
import com.mahesaiqbal.mysimplecleanarchitecture.data.MessageRepository
import com.mahesaiqbal.mysimplecleanarchitecture.domain.IMessageRepository
import com.mahesaiqbal.mysimplecleanarchitecture.domain.MessageInteractor
import com.mahesaiqbal.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}