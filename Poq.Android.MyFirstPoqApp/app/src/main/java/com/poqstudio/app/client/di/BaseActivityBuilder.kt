package com.poqstudio.app.client.di

import com.poqstudio.app.platform.dagger.module.PoqWebViewModule
import com.poqstudio.app.platform.dagger.module.WebCheckoutNavigatorModule
import com.poqstudio.app.platform.dagger.module.favouriteview.FavouriteViewModuleActivityScope
import com.poqstudio.app.platform.dagger.module.presentation.*
import com.poqstudio.app.platform.dagger.module.presentation.cart.CartNavigatorModule
import com.poqstudio.app.platform.dagger.module.presentation.category.CategoryFragmentBuilder
import com.poqstudio.app.platform.dagger.module.presentation.filters.PriceRangeModule
import com.poqstudio.app.platform.dagger.module.presentation.login.LoginGateActivityModule
import com.poqstudio.app.platform.dagger.module.presentation.myaccount.MyAccountFragmentBuilder
import com.poqstudio.app.platform.dagger.module.presentation.page.PagesFragmentBuilder
import com.poqstudio.app.platform.dagger.module.presentation.pdp.PdpModule
import com.poqstudio.app.platform.dagger.module.presentation.productdetail.ProductCarouselNavigatorModule
import com.poqstudio.app.platform.dagger.module.presentation.recommendations.RecommendationsModule
import com.poqstudio.app.platform.dagger.module.presentation.reviews.ReviewsModule
import com.poqstudio.app.platform.dagger.module.presentation.store.StoreSelectedModule
import com.poqstudio.app.platform.dagger.module.presentation.wishlist.WishlistActivityModule
import com.poqstudio.app.platform.dagger.module.presentation.wishlist.WishlistFragmentBuilder
import com.poqstudio.app.platform.dagger.scope.ActivityScope
import com.poqstudio.app.platform.presentation.addressBook.view.*
import com.poqstudio.app.platform.presentation.countrySwitcher.view.CountrySwitcherChangeCountryActivity
import com.poqstudio.app.platform.presentation.countrySwitcher.view.CountrySwitcherSelectCountryActivity
import com.poqstudio.app.platform.presentation.main.view.BottomNavigationActivity
import com.poqstudio.app.platform.presentation.order.detail.view.OrderDetailsActivity
import com.poqstudio.app.platform.presentation.order.history.view.OrderHistoryActivity
import com.poqstudio.app.platform.presentation.reviews.view.ReviewsActivity
import com.poqstudio.app.platform.presentation.search.visualSearch.VisualSearchMultiCategoriesResultsActivity
import com.poqstudio.app.platform.presentation.splash.view.SplashActivity
import com.poqstudio.app.platform.presentation.wishlist.view.WishListActivity
import com.poqstudio.app.platform.view.account.MyAccountActivity
import com.poqstudio.app.platform.view.account.login.LoginActivity
import com.poqstudio.app.platform.view.account.register.RegisterAccountActivity
import com.poqstudio.app.platform.view.account.update.EditAccountActivity
import com.poqstudio.app.platform.view.category.CategoryListActivity
import com.poqstudio.app.platform.view.checkout.CheckoutV1Activity
import com.poqstudio.app.platform.view.checkout.CheckoutV2Activity
import com.poqstudio.app.platform.view.login.LoginGateActivity
import com.poqstudio.app.platform.view.lookbook.LookbookActivity
import com.poqstudio.app.platform.view.main.MainActivity
import com.poqstudio.app.platform.view.main.forceupdate.ForceUpdateActivity
import com.poqstudio.app.platform.view.main.onboarding.OnboardingActivity
import com.poqstudio.app.platform.view.modularBag.ModularBagActivity
import com.poqstudio.app.platform.view.modularPDP.PdpActivity
import com.poqstudio.app.platform.view.modularPDP.ProductDescriptionActivity
import com.poqstudio.app.platform.view.modularPDP.VideoViewActivity
import com.poqstudio.app.platform.view.page.ModularPageListActivity
import com.poqstudio.app.platform.view.page.PageDetailActivity
import com.poqstudio.app.platform.view.page.PoqWebViewActivity
import com.poqstudio.app.platform.view.page.PoqWebViewAuthActivity
import com.poqstudio.app.platform.view.product.ProductImageFullScreenActivity
import com.poqstudio.app.platform.view.product.filters.FiltersActivity
import com.poqstudio.app.platform.view.product.filters.FiltersSelectionActivity
import com.poqstudio.app.platform.view.product.filtersStatic.StaticFilterActivity
import com.poqstudio.app.platform.view.product.plp.ProductListActivity
import com.poqstudio.app.platform.view.product.recent.RecentProductsActivity
import com.poqstudio.app.platform.view.scan.ScanActivity
import com.poqstudio.app.platform.view.search.PoqCropImageActivity
import com.poqstudio.app.platform.view.search.SearchActivity
import com.poqstudio.app.platform.view.search.VisualSearchEmptyResultsActivity
import com.poqstudio.app.platform.view.search.VisualSearchSingleCategoryResultsActivity
import com.poqstudio.app.platform.view.store.FavouriteStoreActivity
import com.poqstudio.app.platform.view.store.FindStoreActivity
import com.poqstudio.app.platform.view.store.SearchByZipCodeActivity
import com.poqstudio.app.platform.view.store.StoreDetailsActivity
import com.poqstudio.app.platform.view.stories.StoriesActivity
import com.poqstudio.app.platform.view.vouchers.*
import com.poqstudio.platform.checkout.cartdagger.CartBuilderModule
import com.poqstudio.platform.checkout.cartdagger.CartFragmentBuilder
import com.poqstudio.platform.checkout.cartdagger.CartModule
import com.poqstudio.platform.component.wishlist.dagger.WishlistComponentModule
import com.poqstudio.platform.core.dagger.LocationModule
import com.poqstudio.platform.core.dagger.SharedScreenModule
import com.poqstudio.platform.view.checkout.cart.ui.CartActivity
import com.poqstudio.platform.view.checkout.webcheckout.WebCheckoutActivityModule
import com.poqstudio.platform.view.checkout.webcheckout.WebCheckoutFragmentBuilder
import com.poqstudio.platform.view.checkout.webcheckout.ui.WebCheckoutActivity
import com.poqstudio.platform.view.content.links.dagger.DefaultDeepLinkProviderModule
import com.poqstudio.platform.view.content.onboarding.di.NewOnboardingFragmentBuilder
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class BaseActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector(modules = [SharedScreenModule::class, FiltersSelectionActivityModule::class])
    abstract fun bindFiltersSelectionActivity(): FiltersSelectionActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, OffersActivityModule::class])
    abstract fun bindOffersActivity(): OffersActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, VouchersActivityModule::class])
    abstract fun bindVouchersActivity(): VouchersActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, ManualVoucherActivityModule::class])
    abstract fun bindManualVoucherActivity(): ManualVoucherActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, ProductDescriptionActivityModule::class])
    abstract fun bindProductDescriptionActivity(): ProductDescriptionActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [SharedScreenModule::class, VideoViewActivityModule::class])
    abstract fun bindVideoViewActivity(): VideoViewActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, ForceUpdateActivityModule::class])
    abstract fun bindForceUpdateActivity(): ForceUpdateActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, VoucherExclusionsActivityModule::class])
    abstract fun bindVoucherExclusionsActivity(): VoucherExclusionsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, AccountModule::class, EditAccountModule::class, AccountValidationModule::class])
    abstract fun bindEditAccountActivity(): EditAccountActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, AccountModule::class, RegisterAccountModule::class, AccountValidationModule::class])
    abstract fun bindRegisterAccountActivity(): RegisterAccountActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, AddAddressModule::class, UKAddressValidatorModule::class, AccountValidationModule::class])
    abstract fun bindAddAddressActivity(): AddAddressActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, AddressBookModule::class])
    abstract fun bindPoqAddressBookActivity(): PoqAddressBookActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, EditAddressModule::class, UKAddressValidatorModule::class, AccountValidationModule::class])
    abstract fun bindEditAddressActivity(): EditAddressActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, USAddAddressModule::class, USAddressValidatorModule::class, AccountValidationModule::class])
    abstract fun bindUSAddAddressActivity(): USAddAddressActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, USEditAddressModule::class, USAddressValidatorModule::class, AccountValidationModule::class])
    abstract fun bindUSEditAddressActivity(): USEditAddressActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, BagModule::class, ContentBlockManagerModule::class])
    abstract fun bindModularBagActivity(): ModularBagActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, CheckoutV1Module::class, LocationModule::class])
    abstract fun bindCheckoutV1Activity(): CheckoutV1Activity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, CheckoutV2Module::class, LocationModule::class])
    abstract fun bindCheckoutV2Activity(): CheckoutV2Activity

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        ActivityModule::class,
        LoginModule::class,
        AccountModule::class,
        AccountValidationModule::class,
        WishlistComponentModule::class
    ])
    abstract fun bindLoginActivity(): LoginActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, LookbookModule::class, LookbookImageModule::class])
    abstract fun bindLookbookActivity(): LookbookActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        ActivityModule::class,
        MainModule::class,
        HomeFragmentBuilder::class,
        CategoryFragmentBuilder::class,
        RateAppDialogFragmentBuilder::class
    ])
    abstract fun bindMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        ActivityModule::class,
        BottomNavigationModule::class,
        HomeFragmentBuilder::class,
        CategoryFragmentBuilder::class,
        WishlistFragmentBuilder::class,
        PagesFragmentBuilder::class,
        MyAccountFragmentBuilder::class,
        RateAppDialogFragmentBuilder::class,
        WishlistComponentModule::class
    ])
    abstract fun bindBottomNavigationActivity(): BottomNavigationActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, OrderHistoryModule::class])
    abstract fun bindOrderHistoryActivity(): OrderHistoryActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, OrderDetailsModule::class])
    abstract fun bindOrderDetailsActivity(): OrderDetailsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        ActivityModule::class,
        PdpModule::class,
        RecommendationsModule::class,
        WishlistComponentModule::class,
        FavouriteViewModuleActivityScope::class
    ])
    abstract fun bindPdpActivity(): PdpActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, ProductImageFullScreenModule::class])
    abstract fun bindProductImageFullScreenActivity(): ProductImageFullScreenActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, FiltersModule::class, PriceRangeModule::class])
    abstract fun bindFiltersActivity(): FiltersActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [SharedScreenModule::class, StaticFilterModule::class, PriceRangeModule::class])
    abstract fun bindStaticFilterActivity(): StaticFilterActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        ActivityModule::class,
        PlpModule::class,
        RecommendationsModule::class,
        WishlistComponentModule::class,
        FavouriteViewModuleActivityScope::class,
        ProductCarouselNavigatorModule::class
    ])
    abstract fun bindProductListActivity(): ProductListActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        ActivityModule::class,
        RecentProductsModule::class,
        WishlistComponentModule::class,
        FavouriteViewModuleActivityScope::class
    ])
    abstract fun bindRecentProductsActivity(): RecentProductsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, ScanModule::class])
    abstract fun bindScanActivity(): ScanActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        ActivityModule::class,
        SearchModule::class
    ])
    abstract fun bindSearchActivity(): SearchActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        ActivityModule::class,
        SplashModule::class,
        DefaultDeepLinkProviderModule::class
    ])
    abstract fun bindSplashActivity(): SplashActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, StoreDetailsModule::class, LocationModule::class])
    abstract fun bindStoreDetailsActivity(): StoreDetailsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        ActivityModule::class,
        StoriesModule::class,
        StoriesPlpModule::class,
        StoriesPdpModule::class,
        WishlistComponentModule::class,
        FavouriteViewModuleActivityScope::class
    ])
    abstract fun bindStoriesActivity(): StoriesActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, WishlistActivityModule::class, WishlistFragmentBuilder::class])
    abstract fun bindWishListActivity(): WishListActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, PoqWebViewAuthModule::class, LocationModule::class])
    abstract fun bindPoqWebViewAuthActivity(): PoqWebViewAuthActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, PoqWebViewModule::class, LocationModule::class])
    abstract fun bindPoqWebViewActivity(): PoqWebViewActivity

    @ActivityScope
    @ContributesAndroidInjector(
            modules = [
                ActivityModule::class,
                FindStoreModule::class,
                StoresMapModule::class,
                AllStoresModule::class,
                NearStoresModule::class,
                StoreSelectedModule::class,
                LocationModule::class
            ]
    )
    abstract fun bindFindStoreActivity(): FindStoreActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, OnBoardingModule::class, OnBoardingFragmentBuilder::class])
    abstract fun bindOnboardingActivity(): OnboardingActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [NewOnboardingFragmentBuilder::class])
    abstract fun bindNewOnboardingActivity(): com.poqstudio.platform.view.content.onboarding.view.OnboardingActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, ModularPageListModule::class, PagesFragmentBuilder::class])
    abstract fun bindModularPageListActivity(): ModularPageListActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        ActivityModule::class,
        PageDetailModule::class,
        LocationModule::class
    ])
    abstract fun bindPageDetailActivity(): PageDetailActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, CropImageModule::class])
    abstract fun bindPoqCropImageActivity(): PoqCropImageActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, VisualSearchEmptyResultsModule::class, RecommendationsModule::class])
    abstract fun bindVisualSearchEmptyResultsActivity(): VisualSearchEmptyResultsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        ActivityModule::class,
        VisualSearchSingleCategoryResultsModule::class,
        WishlistComponentModule::class,
        FavouriteViewModuleActivityScope::class
    ])
    abstract fun bindVisualSearchSingleCategoryResultsActivity(): VisualSearchSingleCategoryResultsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, VisualSearchMultiCategoriesResultsModule::class, RecommendationsModule::class])
    abstract fun bindVisualSearchMultiCategoriesResultsActivity(): VisualSearchMultiCategoriesResultsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, FavouriteStoreModule::class, LocationModule::class])
    abstract fun bindFavouriteStoreActivity(): FavouriteStoreActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, VouchersDashboardModule::class])
    abstract fun bindVouchersDashboardActivity(): VouchersDashboardActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, VoucherDetailsModule::class])
    abstract fun bindVoucherDetailsActivity(): VoucherDetailsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, CategoryListModule::class])
    abstract fun bindCategoryListActivity(): CategoryListActivity

    @ActivityScope
    @ContributesAndroidInjector(
            modules = [
                ActivityModule::class,
                SearchByZipCodeModule::class,
                StoreSelectedModule::class,
                LocationModule::class
            ]
    )
    abstract fun bindSearchByZipCodeActivity(): SearchByZipCodeActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, MyAccountModule::class, MyAccountFragmentBuilder::class])
    abstract fun bindMyAccountActivity(): MyAccountActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, CountrySwitcherChangeCountryModule::class])
    abstract fun bindCountrySwitcherChangeCountryActivity(): CountrySwitcherChangeCountryActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, CountrySwitcherSelectCountryModule::class])
    abstract fun bindCountrySwitcherSelectCountryActivity(): CountrySwitcherSelectCountryActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, ReviewsModule::class])
    abstract fun bindReviewsActivity(): ReviewsActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [ActivityModule::class, LoginGateActivityModule::class])
    abstract fun bindLoginGateActivity(): LoginGateActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [
        WebCheckoutActivityModule::class,
        WebCheckoutFragmentBuilder::class,
        WebCheckoutNavigatorModule::class,
        SharedScreenModule::class,
        LocationModule::class,
        WebCheckoutAnalyticsModule::class
    ])
    abstract fun bindWebCheckoutActivity(): WebCheckoutActivity

}