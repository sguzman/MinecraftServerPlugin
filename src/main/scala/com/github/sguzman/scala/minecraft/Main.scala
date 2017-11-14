package com.github.sguzman.scala.minecraft

import org.bukkit.plugin.java.JavaPlugin

class Main extends JavaPlugin {
  override def onEnable(): Unit = println("Tee hee! You turned me on")

  override def onDisable(): Unit = println("Boo! You turned me off")
}
