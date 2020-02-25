package d3rpla_4202_6706180113.preasestment1mobpro


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import d3rpla_4202_6706180113.preasestment1mobpro.databinding.FragmentHomeBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.btPersegiPanjang.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_persegiPanjangFragment))
        binding.btSegitiga.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_segitigaFragment))

        return binding.root
    }


}
