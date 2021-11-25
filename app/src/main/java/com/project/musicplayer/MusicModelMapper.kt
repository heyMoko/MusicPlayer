package com.project.musicplayer

import com.project.musicplayer.service.MusicDto
import com.project.musicplayer.service.MusicEntity

fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        streamUrl = streamUrl,
        coverUrl = coverUrl,
        track = track,
        artist = artist
    )