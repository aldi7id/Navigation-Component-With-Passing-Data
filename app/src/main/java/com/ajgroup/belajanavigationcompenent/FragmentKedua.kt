package com.ajgroup.belajanavigationcompenent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.findNavController
import com.ajgroup.belajanavigationcompenent.databinding.FragmentKeduaBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentKedua.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentKedua : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentKeduaBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentKeduaBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view:View, savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)
       val aName = arguments?.getString(FragmentPertama.EXTRA_NAME)
        binding.tvNamaKamu.text = "Name kami: $aName"

        binding.btnFragmentKetiga.setOnClickListener {
            if (binding.etName.text.isNullOrEmpty()){
                Toast.makeText(requireContext(),"Kolom Nama masih kosong", Toast.LENGTH_SHORT).show()
            } else {
                val actionToFragmentKetiga =
                    FragmentKeduaDirections.actionFragmentKeduaToFragmentKetiga(binding.etName.text.toString())
                it.findNavController().navigate(actionToFragmentKetiga)
            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}