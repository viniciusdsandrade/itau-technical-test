package com.restful.itau.technical.test.model

import java.time.OffsetDateTime

data class Transacao(
    val valor: Double,
    val dataHora: OffsetDateTime
)
