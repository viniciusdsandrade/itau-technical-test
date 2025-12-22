package com.restful.itau.technical.test.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "janela")
data class JanelaProperties(
    val segundos: Long
)