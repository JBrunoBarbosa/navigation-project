package bruno_brabosa.convidados.navigation_project.extension

import androidx.cardview.widget.CardView
import androidx.navigation.Navigation

fun CardView.onClickNavigate (navigateTo: Int) {
    this.setOnClickListener {
        Navigation.findNavController(it).navigate(navigateTo)
    }
}