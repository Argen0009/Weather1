package mbk.io.weather.presentora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mbk.io.weather.R
import mbk.io.weather.databinding.FragmentConditionBinding

class ConditionFragment : Fragment() {

    private lateinit var binding: FragmentConditionBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentConditionBinding.inflate(inflater, container, false)
        return binding.root

        inflater.inflate(R.layout.fragment_condition,container,false)
    }

}