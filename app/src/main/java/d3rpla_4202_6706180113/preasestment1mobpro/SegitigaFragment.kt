package d3rpla_4202_6706180113.preasestment1mobpro


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import d3rpla_4202_6706180113.preasestment1mobpro.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {
    private lateinit var binding: FragmentSegitigaBinding
    private val KEY_HASIL_KELILING_SEGITIGA = "KEY_HASIL_KELILING_SEGITIGA"
    private val KEY_HASIL_LUAS_SEGITIGA = "KEY_HASIL_LUAS_SEGITIGA"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_segitiga, container, false)

        if (savedInstanceState != null) {
            binding.tvHasilLuasSegitiga.text = savedInstanceState.getDouble(KEY_HASIL_LUAS_SEGITIGA).toString()
            binding.tvHasilKelilingSegitiga.text = savedInstanceState.getDouble(KEY_HASIL_KELILING_SEGITIGA).toString()
        }

        binding.btHitungSegitiga.setOnClickListener {
            val hasilKeliling =
                hitungKeliling(binding.etAlas.text.toString().toInt(), binding.etTinggi.text.toString().toInt())
            val hasilLuas = hitungLuas(binding.etAlas.text.toString().toInt(), binding.etTinggi.text.toString().toInt())
            binding.tvHasilLuasSegitiga.text = hasilLuas.toString()
            binding.tvHasilKelilingSegitiga.text = hasilKeliling.toString()
        }

        return binding.root
    }

    fun hitungKeliling(alas: Int, tinggi: Int): Double {
        var sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi).toDouble())
        return (alas + tinggi + sisiMiring)
    }

    fun hitungLuas(alas: Int, tinggi: Int): Double {
        return (alas * tinggi / 2).toDouble()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.run {
            putDouble(KEY_HASIL_KELILING_SEGITIGA, binding.tvHasilKelilingSegitiga.text.toString().toDouble())
            putDouble(KEY_HASIL_LUAS_SEGITIGA, binding.tvHasilLuasSegitiga.text.toString().toDouble())
        }
    }

}
