package com.example.mrdaggerisdagger.model

data class Computer(
    val processor: Processor,
    val motherboard: Motherboard,
    val ram: Ram
)

class Processor{
    override fun toString(): String = "Rx6100"
}

class Motherboard{
    override fun toString(): String = "X7 3000"
}

class Ram{
    override fun toString(): String = "32 GB"
}