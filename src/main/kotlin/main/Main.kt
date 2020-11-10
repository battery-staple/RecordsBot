package com.rohengiralt.main

import com.jessecorbett.diskord.dsl.bot
import com.jessecorbett.diskord.dsl.command
import com.jessecorbett.diskord.dsl.commands
import com.jessecorbett.diskord.util.mention
import com.rohengiralt.config.SecretsSpec
import com.rohengiralt.config.config


suspend fun main() {
    bot(config[SecretsSpec.token]) {
        commands(prefix = "!") {
            command("ping") {
                reply("pong!")
            }

            command("whoami") {
                reply("${author.mention}'s name is ${author.username}")
            }
        }

    }
}