package bruno_brabosa.convidados.navigation_project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<T : ViewBinding> : Fragment() {

    protected lateinit var binding: T

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = getViewBinding()
        setUpClicksListeners()
        setUpClickNext()
        setUpClickBack()

        return binding.root
    }

    abstract fun getViewBinding(): T
    open fun setUpClicksListeners() {}
    open fun setUpClickNext() {}
    open fun setUpClickBack() {}
}