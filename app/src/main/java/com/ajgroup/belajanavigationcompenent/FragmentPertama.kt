package com.ajgroup.belajanavigationcompenent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.ajgroup.belajanavigationcompenent.databinding.FragmentPertamaBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentPertama.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentPertama : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentPertamaBinding? = null
    private val binding get() = _binding!!
    companion object {
        val EXTRA_NAME = "EXTRA_NAME"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPertamaBinding.inflate(inflater, container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnFragmentKedua.setOnClickListener {
            val mBundle = Bundle()
            mBundle.putString(EXTRA_NAME, "Binarian Pertama")
            it.findNavController().navigate(R.id.action_fragmentPertama_to_fragmentKedua, mBundle)
        }
        }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
    }



