package bruno_brabosa.convidados.navigation_project

import bruno_brabosa.convidados.navigation_project.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override fun setViewBinding() = FragmentMainBinding.inflate(layoutInflater)

    override fun setUpClicksListeners() {
        binding.apply {
            btnAbove.onClickNavigate(R.id.navigate_to_top_fragment)
            btnMiddle.onClickNavigate(R.id.navigate_to_middle_one)
            btnBottom.onClickNavigate(R.id.navigate_to_bottom_one)
        }
    }
}