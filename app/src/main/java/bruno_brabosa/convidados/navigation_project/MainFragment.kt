package bruno_brabosa.convidados.navigation_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import bruno_brabosa.convidados.navigation_project.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        setUpViewBinding()
        setUpClicksListeners()

        return binding.root
    }

    private fun setUpViewBinding() {
        binding = FragmentMainBinding.inflate(layoutInflater)
    }

    private fun setUpClicksListeners() {
        binding.apply {

            btnAbove.setOnClickListener {
                view?.let { view -> Navigation.findNavController(view).navigate(R.id.navigate_to_top_fragment) }
            }

            btnMiddle.setOnClickListener {
                view?.let { view -> Navigation.findNavController(view).navigate(R.id.navigate_to_middle_one) }
            }

            btnBottom.setOnClickListener {
                view?.let { view -> Navigation.findNavController(view).navigate(R.id.navigate_to_bottom_one) }
            }
        }
    }
}