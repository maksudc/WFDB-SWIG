Summary: WFDB Java wrappers
Name: wfdb-java
Version: 10.5
Release: 1
License: GPL
Group: Libraries
URL: http://www.physionet.org/physiotools/wfdb.shtml
Source0: wfdb-java.tar.gz
BuildRoot: %{_tmppath}/%{name}-%{version}-%{release}-root

%description

%prep
%setup -q -n wfdb-java

%build
./configure CFLAGS="-O1 -I/usr/include " --disable-static --prefix=$RPM_BUILD_ROOT/usr
make 

%install
rm -rf $RPM_BUILD_ROOT
make install

%clean
rm -rf $RPM_BUILD_ROOT

%files
%defattr(-,root,root,-)
%doc
/usr/lib/libwfdbjava.*
/usr/share/java/wfdb*.jar*

%changelog
* Sat Mar 11 2006 George B Moody <george@mit.edu>
- Updated for WFDB 10.4.
* Tue Mar 22 2005 Isaac C Henry <ihenry@pc9.ecg.mit.edu> - java-1
- Initial build.


