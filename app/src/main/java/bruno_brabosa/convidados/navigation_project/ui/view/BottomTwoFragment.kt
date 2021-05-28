package bruno_brabosa.convidados.navigation_project.ui.view

import bruno_brabosa.convidados.navigation_project.R
import bruno_brabosa.convidados.navigation_project.databinding.FragmentAddBottomTwoBinding

class BottomTwoFragment : BaseFragment<FragmentAddBottomTwoBinding>() {

    override fun setViewBinding() = FragmentAddBottomTwoBinding.inflate(layoutInflater)
    override fun setUpClickNext() = binding.btnNext.onClickNavigate(R.id.navigate_to_bottom_three)
    override fun setUpClickBack() = binding.btnBack.setOnClickListener { activity?.onBackPressed() }
}