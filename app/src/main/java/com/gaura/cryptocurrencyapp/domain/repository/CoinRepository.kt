package com.gaura.cryptocurrencyapp.domain.repository

import com.gaura.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.gaura.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}