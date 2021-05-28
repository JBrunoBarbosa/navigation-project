package bruno_brabosa.convidados.navigation_project

import bruno_brabosa.convidados.navigation_project.databinding.FragmentAddBottomFourBinding

class BottomFourFragment : BaseFragment<FragmentAddBottomFourBinding>() {

    override fun setViewBinding() = FragmentAddBottomFourBinding.inflate(layoutInflater)
    override fun setUpClickNext() = binding.btnNext.onClickNavigate(R.id.navigate_to_main)
    override fun setUpClickBack() = binding.btnBack.setOnClickListener { activity?.onBackPressed() }
}