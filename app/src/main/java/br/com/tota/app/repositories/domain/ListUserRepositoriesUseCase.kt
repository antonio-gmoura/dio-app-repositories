package br.com.tota.app.repositories.domain

import br.com.tota.app.repositories.core.UseCase
import br.com.tota.app.repositories.data.model.Repo
import br.com.tota.app.repositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}