package com.lla.langlearnai.constants

import com.lla.langlearnai.model.SkillSelectionItem

class Constants {
    companion object {
        /*
         Lista de opçôes de habilidades que o usuário pode escolher aprender primeiro.
         Ao mudar essa lista, a UI irá mudar automaticamente.
         */
        val SKILL_SELECTION_LIST = listOf(
            SkillSelectionItem("Escrita"),
            SkillSelectionItem("Leitura"),
            SkillSelectionItem("Pronúncia"),
            SkillSelectionItem("Audição"),
            SkillSelectionItem("Todos")
        )
    }
}