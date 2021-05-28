package bruno_brabosa.convidados.navigation_project.ui.view

import bruno_brabosa.convidados.navigation_project.R
import bruno_brabosa.convidados.navigation_project.databinding.FragmentBottomOneBinding
import bruno_brabosa.convidados.navigation_project.extension.onClickNavigate

class BottomOneFragment : BaseFragment<FragmentBottomOneBinding>() {

    override fun setViewBinding() = FragmentBottomOneBinding.inflate(layoutInflater)
    override fun setUpClickNext() = binding.btnNext.onClickNavigate(R.id.navigate_to_bottom_two)
    override fun setUpClickBack() = binding.btnBack.setOnClickListener { activity?.onBackPressed() }

}