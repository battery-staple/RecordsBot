package com.rohengiralt.config

import com.uchuhimo.konf.Config
import com.uchuhimo.konf.ConfigSpec
import com.uchuhimo.konf.source.yaml

object SecretsSpec : ConfigSpec() {
    val token by optional("Example Token")
}

val config = Config {
    addSpec(SecretsSpec)
}
    .from.yaml.resource("secrets.yaml")