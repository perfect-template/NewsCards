package me.moallemi.newscards.data.datasource

import io.reactivex.Single
import me.moallemi.newscards.data.entity.ArticlesResultEntity

interface ArticleRemoteDataSource {
    fun getTopHeadlines(): Single<ArticlesResultEntity>
}