package com.workid.activities.login.forgotPassword

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.workid.R
/**
 * A simple [Fragment] subclass.
 * Use the [ForgotPasswordStep2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ForgotPasswordStep2Fragment : Fragment() {

    companion object {
        fun newInstance() = ForgotPasswordStep2Fragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot_password_step2, container, false)
    }
}