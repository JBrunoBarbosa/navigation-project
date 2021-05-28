package bruno_brabosa.convidados.navigation_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import bruno_brabosa.convidados.navigation_project.databinding.FragmentMiddleOneBinding
import bruno_brabosa.convidados.navigation_project.databinding.FragmentTopBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MiddleOneFragment : Fragment() {
    private lateinit var binding: FragmentMiddleOneBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        setUpViewBinding()
        setUpClicksListeners()

        return binding.root
    }

    private fun setUpViewBinding() {
        binding = FragmentMiddleOneBinding.inflate(layoutInflater)
    }

    private fun setUpClicksListeners() {
        binding.apply {

            btnNext.setOnClickListener {
                view?.let { view -> Navigation.findNavController(view).navigate(R.id.navigate_to_middle_two) }
            }

            btnBack.setOnClickListener {
                activity?.onBackPressed()
            }
        }
    }
}