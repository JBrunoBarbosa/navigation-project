package bruno_brabosa.convidados.navigation_project.ui.view

import bruno_brabosa.convidados.navigation_project.R
import bruno_brabosa.convidados.navigation_project.databinding.FragmentBottomTwoBinding
import bruno_brabosa.convidados.navigation_project.extension.onClickNavigate

class BottomTwoFragment : BaseFragment<FragmentBottomTwoBinding>() {

    override fun setViewBinding() = FragmentBottomTwoBinding.inflate(layoutInflater)
    override fun setUpClickNext() = binding.btnNext.onClickNavigate(R.id.navigate_to_bottom_three)
    override fun setUpClickBack() = binding.btnBack.setOnClickListener { activity?.onBackPressed() }
}