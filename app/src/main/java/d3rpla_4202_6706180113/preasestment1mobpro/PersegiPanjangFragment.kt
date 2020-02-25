package d3rpla_4202_6706180113.preasestment1mobpro


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import d3rpla_4202_6706180113.preasestment1mobpro.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {
    lateinit var binding: FragmentPersegiPanjangBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_persegi_panjang, container, false)

        binding.btHitungPersegiPanjang.setOnClickListener {
            val hasilKeliling =
                hitungKeliling(binding.etPanjang.text.toString().toInt(), binding.etLebar.text.toString().toInt())
            val hasilLuas =
                hitungLuas(binding.etPanjang.text.toString().toInt(), binding.etLebar.text.toString().toInt())
//            binding.tvHasilKelilingPersegiPanjang.setText(hasilKeliling.toString())
            binding.tvHasilLuasPersegiPanjang.text = hasilLuas.toString()
        }

        return binding.root
    }

    fun hitungKeliling(panjang: Int, lebar: Int): Double {
        return (panjang * 2) + (lebar * 2).toDouble()
    }

    fun hitungLuas(panjang: Int, lebar: Int): Double {
        return (panjang * lebar).toDouble()
    }


}
