package bruno_brabosa.convidados.navigation_project.ui.view

import bruno_brabosa.convidados.navigation_project.R
import bruno_brabosa.convidados.navigation_project.databinding.FragmentAddBottomThreeBinding
import bruno_brabosa.convidados.navigation_project.extension.onClickNavigate

class BottomThreeFragment : BaseFragment<FragmentAddBottomThreeBinding>() {

    override fun setViewBinding() = FragmentAddBottomThreeBinding.inflate(layoutInflater)
    override fun setUpClickNext() = binding.btnNext.onClickNavigate(R.id.navigate_to_bottom_four)
    override fun setUpClickBack() = binding.btnBack.setOnClickListener { activity?.onBackPressed() }

}