package mobile.gan.task2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.buttonToFirstFragment)
        button.setOnClickListener{
            (requireActivity() as MainActivity).toFirstFragment()
        }
    }

    companion object {
        fun newInstance() = SecondFragment()
    }
}