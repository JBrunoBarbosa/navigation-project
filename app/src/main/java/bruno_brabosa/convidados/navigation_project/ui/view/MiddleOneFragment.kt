package bruno_brabosa.convidados.navigation_project.ui.view

import bruno_brabosa.convidados.navigation_project.R
import bruno_brabosa.convidados.navigation_project.databinding.FragmentMiddleOneBinding
import bruno_brabosa.convidados.navigation_project.extension.onClickNavigate

class MiddleOneFragment : BaseFragment<FragmentMiddleOneBinding>() {

    override fun setViewBinding() = FragmentMiddleOneBinding.inflate(layoutInflater)
    override fun setUpClickNext() = binding.btnNext.onClickNavigate(R.id.navigate_to_middle_two)
    override fun setUpClickBack() = binding.btnBack.setOnClickListener { activity?.onBackPressed() }
}