package com.plcoding.echojournal.echos.presentation.echos

import com.plcoding.echojournal.echos.presentation.echos.models.EchoFilterChip
import com.plcoding.echojournal.echos.presentation.models.MoodUi

sealed interface EchosAction {
    data object OnMoodChipClick: EchosAction
    data object OnDismissMoodDropDown: EchosAction
    data class OnFilterByMoodClick(val moodUi: MoodUi): EchosAction
    data object OnTopicChipClick: EchosAction
    data object OnDismissTopicDropDown: EchosAction
    data class OnFilterByTopicClick(val topic: String): EchosAction
    data object OnFabClick: EchosAction
    data object OnFabLongClick: EchosAction
    data object OnSettingsClick: EchosAction
    data class OnRemoveFilters(val filterType: EchoFilterChip): EchosAction
}