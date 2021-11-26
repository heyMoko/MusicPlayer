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

fun MusicDto.mapper(): PlayerModel =
    PlayerModel(

        playMusicList = musics.mapIndexed { index, musicEntity ->
                musicEntity.mapper(index.toLong())
            }
    )