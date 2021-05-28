package bruno_brabosa.convidados.navigation_project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import bruno_brabosa.convidados.navigation_project.databinding.FragmentAddBottomThreeBinding

class BottomThreeFragment : Fragment() {

    private lateinit var binding: FragmentAddBottomThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewBinding()
        setUpClicksListeners()

        return binding.root
    }

    private fun setUpViewBinding() {
        binding = FragmentAddBottomThreeBinding.inflate(layoutInflater)
    }

    private fun setUpClicksListeners() {
        binding.apply {

            btnNext.setOnClickListener {
                view?.let { view -> Navigation.findNavController(view).navigate(R.id.bottomFourFragment) }
            }

            btnBack.setOnClickListener {
                activity?.onBackPressed()
            }
        }
    }

}