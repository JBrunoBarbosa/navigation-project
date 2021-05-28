package bruno_brabosa.convidados.navigation_project

import bruno_brabosa.convidados.navigation_project.databinding.FragmentBottomOneBinding

class BottomOneFragment : BaseFragment<FragmentBottomOneBinding>() {

    override fun getViewBinding() = FragmentBottomOneBinding.inflate(layoutInflater)
    override fun setUpClickNext() = binding.btnNext.onClickNavigate(R.id.navigate_to_bottom_two)
    override fun setUpClickBack() = binding.btnBack.setOnClickListener { activity?.onBackPressed() }

}