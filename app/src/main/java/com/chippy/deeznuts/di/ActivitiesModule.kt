/* Copyright 2018 charlag
 *
 * This file is a part of Tusky.
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * Tusky is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Tusky; if not,
 * see <http://www.gnu.org/licenses>. */

package com.chippy.deeznuts.di

import com.chippy.deeznuts.AboutActivity
import com.chippy.deeznuts.AccountListActivity
import com.chippy.deeznuts.BaseActivity
import com.chippy.deeznuts.EditProfileActivity
import com.chippy.deeznuts.FiltersActivity
import com.chippy.deeznuts.LicenseActivity
import com.chippy.deeznuts.ListsActivity
import com.chippy.deeznuts.MainActivity
import com.chippy.deeznuts.SplashActivity
import com.chippy.deeznuts.StatusListActivity
import com.chippy.deeznuts.TabPreferenceActivity
import com.chippy.deeznuts.ViewMediaActivity
import com.chippy.deeznuts.components.account.AccountActivity
import com.chippy.deeznuts.components.announcements.AnnouncementsActivity
import com.chippy.deeznuts.components.compose.ComposeActivity
import com.chippy.deeznuts.components.drafts.DraftsActivity
import com.chippy.deeznuts.components.instancemute.InstanceListActivity
import com.chippy.deeznuts.components.login.LoginActivity
import com.chippy.deeznuts.components.login.LoginWebViewActivity
import com.chippy.deeznuts.components.preference.PreferencesActivity
import com.chippy.deeznuts.components.report.ReportActivity
import com.chippy.deeznuts.components.scheduled.ScheduledStatusActivity
import com.chippy.deeznuts.components.search.SearchActivity
import com.chippy.deeznuts.components.viewthread.ViewThreadActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by charlag on 3/24/18.
 */

@Module
abstract class ActivitiesModule {

    @ContributesAndroidInjector
    abstract fun contributesBaseActivity(): BaseActivity

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributesMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributesAccountActivity(): AccountActivity

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributesListsActivity(): ListsActivity

    @ContributesAndroidInjector
    abstract fun contributesComposeActivity(): ComposeActivity

    @ContributesAndroidInjector
    abstract fun contributesEditProfileActivity(): EditProfileActivity

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributesAccountListActivity(): AccountListActivity

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributesViewThreadActivity(): ViewThreadActivity

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributesStatusListActivity(): StatusListActivity

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributesSearchActivity(): SearchActivity

    @ContributesAndroidInjector
    abstract fun contributesAboutActivity(): AboutActivity

    @ContributesAndroidInjector
    abstract fun contributesLoginActivity(): LoginActivity

    @ContributesAndroidInjector
    abstract fun contributesLoginWebViewActivity(): LoginWebViewActivity

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributesPreferencesActivity(): PreferencesActivity

    @ContributesAndroidInjector
    abstract fun contributesViewMediaActivity(): ViewMediaActivity

    @ContributesAndroidInjector
    abstract fun contributesLicenseActivity(): LicenseActivity

    @ContributesAndroidInjector
    abstract fun contributesTabPreferenceActivity(): TabPreferenceActivity

    @ContributesAndroidInjector
    abstract fun contributesFiltersActivity(): FiltersActivity

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributesReportActivity(): ReportActivity

    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributesInstanceListActivity(): InstanceListActivity

    @ContributesAndroidInjector
    abstract fun contributesScheduledStatusActivity(): ScheduledStatusActivity

    @ContributesAndroidInjector
    abstract fun contributesAnnouncementsActivity(): AnnouncementsActivity

    @ContributesAndroidInjector
    abstract fun contributesDraftActivity(): DraftsActivity

    @ContributesAndroidInjector
    abstract fun contributesSplashActivity(): SplashActivity
}
