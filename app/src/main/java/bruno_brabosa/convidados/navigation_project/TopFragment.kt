package bruno_brabosa.convidados.navigation_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import bruno_brabosa.convidados.navigation_project.databinding.FragmentMainBinding
import bruno_brabosa.convidados.navigation_project.databinding.FragmentTopBinding

class TopFragment : Fragment() {
    private lateinit var binding: FragmentTopBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        setUpViewBinding()
        setUpClicksListeners()

        return binding.root
    }

    private fun setUpViewBinding() {
        binding = FragmentTopBinding.inflate(layoutInflater)
    }

    private fun setUpClicksListeners() {
        binding.apply {

            btnNext.setOnClickListener {
                view?.let { view -> Navigation.findNavController(view).navigate(R.id.navigate_to_main) }
            }
            btnBack.setOnClickListener {
                activity?.onBackPressed()
            }
        }
    }
}