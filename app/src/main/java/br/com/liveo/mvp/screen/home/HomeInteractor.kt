package br.com.liveo.mvp.screen.home

import br.com.liveo.mvp.data.remote.EndPointHelper
import br.com.liveo.mvp.model.domain.UserResponse
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by rudsonlima on 9/4/17.
 */
class HomeInteractor @Inject
constructor(private val endPointHelper: EndPointHelper) : HomeContract.Interactor {
    override fun fetchUsers(page: Int): Single<UserResponse> = endPointHelper.fetchUsers(page)
}
