package d3rpla_4202_6706180113.preasestment1mobpro


import android.content.Intent
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
    private val KEY_HASIL_KELILING_PERSEGI_PANJANG = "KEY_HASIL_KELILING_PERSEGI_PANJANG"
    private val KEY_HASIL_LUAS_PERSEGI_PANJANG = "KEY_HASIL_PERSEGI_PANJANG"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_persegi_panjang, container, false)

        if (savedInstanceState != null) {
            binding.tvHasilLuasPersegiPanjang.text =
                savedInstanceState.getDouble(KEY_HASIL_LUAS_PERSEGI_PANJANG).toString()
            binding.tvHasilKelilingPersegiPanjang.text =
                savedInstanceState.getDouble(KEY_HASIL_KELILING_PERSEGI_PANJANG).toString()
        }

        binding.btHitungPersegiPanjang.setOnClickListener {
            val hasilKeliling =
                hitungKeliling(binding.etPanjang.text.toString().toInt(), binding.etLebar.text.toString().toInt())
            val hasilLuas =
                hitungLuas(binding.etPanjang.text.toString().toInt(), binding.etLebar.text.toString().toInt())
            binding.tvHasilKelilingPersegiPanjang.text = hasilKeliling.toString()
            binding.tvHasilLuasPersegiPanjang.text = hasilLuas.toString()
        }

        binding.btShareHasilPersegiPanjang.setOnClickListener {
            val isiPesan =
                "Hasil perhitungan persegi panjang:\nLuas = ${binding.tvHasilLuasPersegiPanjang.text} \nKeliling = ${binding.tvHasilKelilingPersegiPanjang.text}"
            startActivity(intentShare(isiPesan))
        }

        return binding.root
    }

    fun hitungKeliling(panjang: Int, lebar: Int): Double {
        return (panjang * 2) + (lebar * 2).toDouble()
    }

    fun hitungLuas(panjang: Int, lebar: Int): Double {
        return (panjang * lebar).toDouble()
    }

    fun intentShare(isiPesan: String): Intent {
        val intentShare = Intent(Intent.ACTION_SEND)
        intentShare.setType("text/plain").putExtra(Intent.EXTRA_TEXT, isiPesan)
        return intentShare
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.run {
            putDouble(KEY_HASIL_LUAS_PERSEGI_PANJANG, binding.tvHasilLuasPersegiPanjang.text.toString().toDouble())
            putDouble(
                KEY_HASIL_KELILING_PERSEGI_PANJANG, binding.tvHasilKelilingPersegiPanjang.text.toString().toDouble()
            )
        }
    }

}
