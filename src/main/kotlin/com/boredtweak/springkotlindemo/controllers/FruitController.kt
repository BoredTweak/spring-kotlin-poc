package com.boredtweak.springkotlindemo.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FruitController {
    @GetMapping("/fruit")
    fun Fruit(): Set<String> = setOf("Apple", "Banana", "Kiwi");
}