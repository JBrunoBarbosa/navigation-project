package bruno_brabosa.convidados.navigation_project

import bruno_brabosa.convidados.navigation_project.databinding.FragmentMiddleOneBinding

class MiddleOneFragment : BaseFragment<FragmentMiddleOneBinding>() {

    override fun getViewBinding() = FragmentMiddleOneBinding.inflate(layoutInflater)
    override fun setUpClickNext() = binding.btnNext.onClickNavigate(R.id.navigate_to_middle_two)
    override fun setUpClickBack() = binding.btnBack.setOnClickListener { activity?.onBackPressed() }
}