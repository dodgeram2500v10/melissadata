guard 'rspec', :cli => '--format documentation' do
  watch(%r{^spec/.+_spec\.rb$})
  watch(%r{^lib/.+\.rb$}) { "spec" }
  watch(%r{^spec/.+_spec\.rb$})
  watch(%r{^lib/.+\.rb$}) { "spec" }
  # watch(%r{^lib/(.+)\.rb$})     { |m| "spec/#{m[1]}_spec.rb" }
  watch('spec/spec_helper.rb')  { "spec" }
end
