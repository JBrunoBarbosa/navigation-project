package bruno_brabosa.convidados.navigation_project.ui.view

import bruno_brabosa.convidados.navigation_project.R
import bruno_brabosa.convidados.navigation_project.databinding.FragmentBottomFourBinding
import bruno_brabosa.convidados.navigation_project.extension.onClickNavigate

class BottomFourFragment : BaseFragment<FragmentBottomFourBinding>() {

    override fun setViewBinding() = FragmentBottomFourBinding.inflate(layoutInflater)
    override fun setUpClickNext() = binding.btnNext.onClickNavigate(R.id.navigate_to_main)
    override fun setUpClickBack() = binding.btnBack.setOnClickListener { activity?.onBackPressed() }
}