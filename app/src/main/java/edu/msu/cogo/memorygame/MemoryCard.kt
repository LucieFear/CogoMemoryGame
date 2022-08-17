package edu.msu.cogo.memorygame

data class MemoryCard(val identifier: Int, var isFaceUp: Boolean = false, var isMatched: Boolean = false)