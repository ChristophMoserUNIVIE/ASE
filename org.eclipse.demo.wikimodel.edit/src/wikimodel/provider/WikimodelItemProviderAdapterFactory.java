/**
 */
package wikimodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import wikimodel.util.WikimodelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WikimodelItemProviderAdapterFactory extends WikimodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikimodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.HistoryPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryPageItemProvider historyPageItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.HistoryPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHistoryPageAdapter() {
		if (historyPageItemProvider == null) {
			historyPageItemProvider = new HistoryPageItemProvider(this);
		}

		return historyPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.EncyclopediaEntry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncyclopediaEntryItemProvider encyclopediaEntryItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.EncyclopediaEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEncyclopediaEntryAdapter() {
		if (encyclopediaEntryItemProvider == null) {
			encyclopediaEntryItemProvider = new EncyclopediaEntryItemProvider(this);
		}

		return encyclopediaEntryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.Media} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaItemProvider mediaItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.Media}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMediaAdapter() {
		if (mediaItemProvider == null) {
			mediaItemProvider = new MediaItemProvider(this);
		}

		return mediaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.ProjectPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectPageItemProvider projectPageItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.ProjectPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectPageAdapter() {
		if (projectPageItemProvider == null) {
			projectPageItemProvider = new ProjectPageItemProvider(this);
		}

		return projectPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.SimpleRegisteredUser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleRegisteredUserItemProvider simpleRegisteredUserItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.SimpleRegisteredUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleRegisteredUserAdapter() {
		if (simpleRegisteredUserItemProvider == null) {
			simpleRegisteredUserItemProvider = new SimpleRegisteredUserItemProvider(this);
		}

		return simpleRegisteredUserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.UnregisteredUser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnregisteredUserItemProvider unregisteredUserItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.UnregisteredUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnregisteredUserAdapter() {
		if (unregisteredUserItemProvider == null) {
			unregisteredUserItemProvider = new UnregisteredUserItemProvider(this);
		}

		return unregisteredUserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.DiscussionPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscussionPageItemProvider discussionPageItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.DiscussionPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiscussionPageAdapter() {
		if (discussionPageItemProvider == null) {
			discussionPageItemProvider = new DiscussionPageItemProvider(this);
		}

		return discussionPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.AutoConfirmedUser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoConfirmedUserItemProvider autoConfirmedUserItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.AutoConfirmedUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAutoConfirmedUserAdapter() {
		if (autoConfirmedUserItemProvider == null) {
			autoConfirmedUserItemProvider = new AutoConfirmedUserItemProvider(this);
		}

		return autoConfirmedUserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.AdminUser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminUserItemProvider adminUserItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.AdminUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdminUserAdapter() {
		if (adminUserItemProvider == null) {
			adminUserItemProvider = new AdminUserItemProvider(this);
		}

		return adminUserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.SysOpUser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysOpUserItemProvider sysOpUserItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.SysOpUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSysOpUserAdapter() {
		if (sysOpUserItemProvider == null) {
			sysOpUserItemProvider = new SysOpUserItemProvider(this);
		}

		return sysOpUserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.UserPageProfile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserPageProfileItemProvider userPageProfileItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.UserPageProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserPageProfileAdapter() {
		if (userPageProfileItemProvider == null) {
			userPageProfileItemProvider = new UserPageProfileItemProvider(this);
		}

		return userPageProfileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.UserTalkPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserTalkPageItemProvider userTalkPageItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.UserTalkPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserTalkPageAdapter() {
		if (userTalkPageItemProvider == null) {
			userTalkPageItemProvider = new UserTalkPageItemProvider(this);
		}

		return userTalkPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.RegisteredUser} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredUserItemProvider registeredUserItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.RegisteredUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegisteredUserAdapter() {
		if (registeredUserItemProvider == null) {
			registeredUserItemProvider = new RegisteredUserItemProvider(this);
		}

		return registeredUserItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.ProjectGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectGroupItemProvider projectGroupItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.ProjectGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectGroupAdapter() {
		if (projectGroupItemProvider == null) {
			projectGroupItemProvider = new ProjectGroupItemProvider(this);
		}

		return projectGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link wikimodel.InterestGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterestGroupItemProvider interestGroupItemProvider;

	/**
	 * This creates an adapter for a {@link wikimodel.InterestGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterestGroupAdapter() {
		if (interestGroupItemProvider == null) {
			interestGroupItemProvider = new InterestGroupItemProvider(this);
		}

		return interestGroupItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (historyPageItemProvider != null) historyPageItemProvider.dispose();
		if (encyclopediaEntryItemProvider != null) encyclopediaEntryItemProvider.dispose();
		if (mediaItemProvider != null) mediaItemProvider.dispose();
		if (projectPageItemProvider != null) projectPageItemProvider.dispose();
		if (simpleRegisteredUserItemProvider != null) simpleRegisteredUserItemProvider.dispose();
		if (unregisteredUserItemProvider != null) unregisteredUserItemProvider.dispose();
		if (discussionPageItemProvider != null) discussionPageItemProvider.dispose();
		if (autoConfirmedUserItemProvider != null) autoConfirmedUserItemProvider.dispose();
		if (adminUserItemProvider != null) adminUserItemProvider.dispose();
		if (sysOpUserItemProvider != null) sysOpUserItemProvider.dispose();
		if (userPageProfileItemProvider != null) userPageProfileItemProvider.dispose();
		if (userTalkPageItemProvider != null) userTalkPageItemProvider.dispose();
		if (registeredUserItemProvider != null) registeredUserItemProvider.dispose();
		if (projectGroupItemProvider != null) projectGroupItemProvider.dispose();
		if (interestGroupItemProvider != null) interestGroupItemProvider.dispose();
	}

}