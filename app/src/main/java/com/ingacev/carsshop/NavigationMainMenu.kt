package com.ingacev.carsshop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.ingacev.carsshop.databinding.FragmentNavigationMainMenuBinding
import com.google.android.material.navigation.NavigationView

class TransitionFragment : Fragment() {

    private lateinit var binding: FragmentNavigationMainMenuBinding
    private lateinit var navController: NavController

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentNavigationMainMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        setupNavigationMenu(binding.navMenuMain)
    }

    private fun setupNavigationMenu(navigationView: NavigationView) {
        navigationView.setupWithNavController(navController)
        navigationView.setNavigationItemSelectedListener { menuItem: MenuItem ->
            when (menuItem.itemId) {
                R.id.nav_my_cars -> {
                    navController.navigate(R.id.action_transitionFragment_to_myCarsFragment)
                    binding.drawerFoundation.closeDrawers()
                    true
                }
                R.id.nav_buy_cars -> {
                    navController.navigate(R.id.action_transitionFragment_to_buyCarsFragment)
                    binding.drawerFoundation.closeDrawers()
                    true
                }
                else -> false
            }
        }
    }

}
